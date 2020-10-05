
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.sql.Date;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Util {

	public static void main(String[] args) throws UnsupportedEncodingException, ParseException {
		Date d = Date.valueOf(LocalDate.now(ZoneOffset.UTC));
		System.out.println(d);
		
		LocalDateTime now = LocalDateTime.now(ZoneOffset.UTC);
		System.out.println(now);
		System.out.println(now.toLocalDate());
		
		String format = now.format(DateTimeFormatter.ofPattern("yyyyMMdd_hh:mm:ss"));
		System.out.println(format);
		
		
		/*
		 * String json =
		 * "{\"Rainbow\":{\"accessKey\":\"badeploy123\",\"secretKey\":\"osho@123\",\"credentialScope\":\"esni\",\"disableValidation\":\"true\"},\"TWC Dist\":{\"accessKey\":\"badeploy123\",\"secretKey\":\"osho@123\",\"credentialScope\":\"esni\",\"disableValidation\":\"true\"}}"
		 * ; HashMap fromJson = new Gson().fromJson(json, HashMap.class);
		 * 
		 * LinkedTreeMap<String, String> object = (LinkedTreeMap<String,
		 * String>)fromJson.get("Rainbow"); System.out.println(object);
		 * System.out.println(object.get("accessKey")); fromJson.keySet().forEach(key
		 * ->{ System.out.println(fromJson.get(key)); });
		 */
		
		/*
		 * String date = "Fri, 3 Apr 2020 16:08:56 -0700";
		 * 
		 * SimpleDateFormat df = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z");
		 * System.out.println(new Date()); System.out.println(df.format(new Date()));
		 * 
		 * System.out.println(DisplayEventStatus.ERROR.name());
		 * System.out.println(DisplayEventStatus.ERROR.value());
		 * System.out.println(DisplayEventStatus.fromValue("PENDING").value());
		 */
		
		/*
		 * Integer i = new Integer(5); Integer j; j =i; j =10; System.out.println("i : "
		 * + i); System.out.println("j : " + j);
		 */
		  
		/*
		 * String id = "gPjbcDLDQFCfTkBQO_pTEw_262_1040_ZIP_66666"; String signalId =
		 * "gPjbcDLDQFCfTkBQO_pTEw"; StringBuffer buffer = new
		 * StringBuffer(id).replace(0, signalId.length()+1, ""); String vpId =
		 * buffer.substring(0, buffer.indexOf("_")); String pId = buffer.replace(0,
		 * vpId.length() +1, "").substring(0, buffer.indexOf("_")); //String pId =
		 * buffer.substring(buffer.indexOf("_"), buffer.indexOf("_")); String mediaId =
		 * buffer.substring(buffer.lastIndexOf("_")+1, buffer.length());
		 * System.out.println("vpId : " + vpId); System.out.println(buffer);
		 * System.out.println("pId : " + pId); System.out.println("buffer " + buffer );
		 * System.out.println("Media: " + mediaId);
		 */
		/*
		 * String time = "-1234"; System.out.println(Integer.parseInt(time));
		 */
		
		
		/*
		 * SimpleDateFormat format =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); Date
		 * parse = format.parse(date); //TimeZone.setDefault(zone);
		 * System.out.println(parse); String parse2 = new
		 * SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX").format(parse);
		 * 
		 * System.out.println(parse2);
		 */
		
		/*
		 * 
		 * String date = "2020-04-22 01:37:05.0"; SimpleDateFormat format = new
		 * SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); SimpleDateFormat responseFormat =
		 * new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX"); Date parsedDate =
		 * format.parse(date); String format2 = responseFormat.format(parsedDate);
		 * System.out.println(format2);
		 * System.out.println(responseFormat.parse(responseFormat.format(parsedDate)));
		 * 
		 */
		
		//System.out.println(format.parse(date));
		/*
		 * List<JsonObject> list = new ArrayList<JsonObject>(); //list.add(10);
		 * 
		 * Object obj = list; List<JsonObject> intList = (List<JsonObject>) obj;
		 * System.out.println(intList);
		 */
		
		
		
		/*
		 * String queryId = "/media/e3c25ee8-048d-4543-971d-e81a07667c43"; String[]
		 * split = queryId.split("/"); for(int i=0; i<split.length;i++) {
		 * System.out.println("i : " + i + " valu : " +split[i]); }
		 *//*
			 * System.out.println(split[0]); System.out.println(split[1]);
			 */
		/*
		 * String type = queryId.substring(queryId.startsWith("/") ? 1 : 0,
		 * queryId.lastIndexOf("/")); System.out.println("Type : " +type);
		 * 
		 * System.out.println("");
		 */
		
		/*
		 * StringBuffer sf = new StringBuffer(id); StringBuffer replace = sf.replace(0,
		 * signalId.length()+1, ""); System.out.println("Replace : " +
		 * replace.substring(0, replace.indexOf("_"))); String strWithoutSignalId =
		 * id.substring(0, signalId.length()+1);
		 */
		 
        //id.substring(id.substring(0, signalId.length()+1), );
		/*
		 * int[] arrau = new int[3]; arrau[0]=1; arrau[1]=2; arrau[2]=3;
		 * List<List<Integer>> permute = permute(arrau); //System.out.println("Array : "
		 * + arrau); System.out.println(permute);
		 * 
		 * 
		 * int n = 3; char[] str = new char[2 * n]; printParenthesis(str, n);
		 */
		
		/*
		 * LocalDate ld = LocalDate.now(ZoneOffset.UTC); LocalDate ldUpdated =
		 * ld.minusDays(180); System.out.println(ldUpdated.getYear());
		 * System.out.println(ld); System.out.println(ldUpdated);
		 * 
		 * StringBuilder sb = new StringBuilder(); sb.append("day=20[]-");
		 */
		
				
		
		
		
		
		
		
		/*
		 * StringBuilder sql = new StringBuilder(); sql.
		 * append("Select aic.industry_category_name, aic.industry_category_id,aic.state_id,grp.industry_category_group_name,"
		 * + "bic.account_id,grp.industry_category_group_id " +
		 * "from ba_industry_category aic " +
		 * "inner join ba_industry_category_group grp "); sql.
		 * append("ON grp.industry_category_group_id=aic.industry_category_group_id  ");
		 * sql.append("LEFT OUTER JOIN ba_account_industry_category bic ON ");
		 * sql.append("( bic.industry_category_id = aic.industry_category_id ");
		 * sql.append(" and bic.account_id = :accountID )"); sql.append
		 * (" where aic.industry_category_name in (:clIndustryNames) ") ;
		 * 
		 * 
		 * sql.
		 * append("Select aic.baIndustryCategory.industryCategoryName, aic.baIndustryCategory.industryCategoryId "
		 * + "from BaAccountIndustryCategory aic join BaIndustryCategoryGroup grp");
		 * sql.
		 * append(" ON aic.baIndustryCategory.baIndustryCategoryGroup.industryCategoryGroupId = grp.industryCategoryGroupId  "
		 * ); sql.append(" LEFT OUTER JOIN aic.baIndustryCategory ic "); sql.append
		 * (" where ic.industryCategoryName in (:clIndustryNames) ") ;
		 * sql.append(" and aic.account.accountId = :accountID ");
		 * 
		 * 
		 * sql.append("Select ic.industryCategoryName, ic.industryCategoryId " +
		 * "from BaIndustryCategory ic join ic.baIndustryCategoryGroup grp"); //sql.
		 * append(" ON aic.baIndustryCategory.baIndustryCategoryGroup.industryCategoryGroupId = grp.industryCategoryGroupId  "
		 * ); sql.append(" LEFT OUTER JOIN ic.baAcountIndustryCategory aic ");
		 * sql.append (" where ic.industryCategoryName in (:clIndustryNames) ") ;
		 * sql.append(" and aic.account.accountId = :accountID ");
		 */

	}
	
	private static String getDecodedString(String encodedString) throws UnsupportedEncodingException{
		  return URLDecoder.decode(encodedString, StandardCharsets.UTF_8.toString());
	  }
	
	public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        //Create no of lists
        for(int i=0;i<nums.length;i++) {
        	
        	List<Integer> list = new ArrayList<Integer>();
        	list.add(nums[i]);
        	list.addAll(remaining(nums,i));
        	output.add(list);
        	
			
			  List<Integer> list2 = new ArrayList<Integer>(); 
			  if(i <nums.length) {
			  list2.add(nums[i]);
			  list2.addAll(swapped(nums, i));
			  }
			  output.add(list2);
			 
        }
        return output;
    }

	private static List<Integer> swapped(int[] nums, int num) {
		// TODO Auto-generated method stub
			List<Integer> returnList1 = new ArrayList<Integer>();
			switch (num) {
			case 0:
				returnList1.add(nums[2]);
				returnList1.add(nums[1]);
				break;

			case 1:
				returnList1.add(nums[2]);
				returnList1.add(nums[0]);
				break;
			case 2:
				returnList1.add(nums[1]);
				returnList1.add(nums[0]);
				break;
			default:
				break;
			}
			return returnList1;
		
	}

	private static List<Integer> remaining(int[] nums, int i2) {
			List<Integer> returnList1 = new ArrayList<Integer>();
			switch (i2) {
			case 0:
				returnList1.add(nums[1]);
				returnList1.add(nums[2]);
				break;

			case 1:
				returnList1.add(nums[0]);
				returnList1.add(nums[2]);
				break;
			case 2:
				returnList1.add(nums[0]);
				returnList1.add(nums[1]);
				break;
			default:
				break;
			}
			return returnList1;
	}

	static void _printParenthesis(char str[], int pos, int n, int open, int close) 
    { 
        if(close == n)  
        { 
            // print the possible combinations 
            for(int i=0;i<str.length;i++) 
                System.out.print(str[i]); 
            System.out.println(); 
            return; 
        } 
        else
        { 
            if(open > close) { 
                str[pos] = ')'; 
                _printParenthesis(str, pos+1, n, open, close+1); 
            } 
            if(open < n) { 
                str[pos] = '('; 
                _printParenthesis(str, pos+1, n, open+1, close); 
            } 
        } 
    } 
      
    // Wrapper over _printParenthesis() 
    static void printParenthesis(char str[], int n) 
    { 
        if(n > 0) 
        _printParenthesis(str, 0, n, 0, 0); 
        return; 
    } 
    
}
