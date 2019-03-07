package de.metas.dataentry.layout.interceptor;

import org.adempiere.ad.dao.IQueryBL;
import org.adempiere.ad.modelvalidator.annotations.Interceptor;
import org.adempiere.ad.modelvalidator.annotations.ModelChange;
import org.compiere.model.ModelValidator;
import org.springframework.stereotype.Component;

import de.metas.dataentry.model.I_DataEntry_Field;
import de.metas.dataentry.model.I_DataEntry_Line;
import de.metas.util.Services;
import lombok.NonNull;

/*
 * #%L
 * metasfresh-webui-api
 * %%
 * Copyright (C) 2019 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

@Component("de.metas.dataentry.layout.interceptor.DataEntry_Line")
@Interceptor(I_DataEntry_Line.class)
public class DataEntry_Line
{
	@ModelChange(timings = ModelValidator.TYPE_BEFORE_DELETE)
	public void deleteChildRecords(@NonNull final I_DataEntry_Line dataEntryLineRecord)
	{
		Services.get(IQueryBL.class)
				.createQueryBuilder(I_DataEntry_Field.class)
				.addEqualsFilter(I_DataEntry_Field.COLUMN_DataEntry_Line_ID, dataEntryLineRecord.getDataEntry_Line_ID())
				.create()
				.delete();
	}
}
