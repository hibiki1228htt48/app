package jp.inc.yumemi.contributorlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Adapterに渡す配列を作成します
        var data = arrayOf("ianhanniballake", "dlam","JoseAlcerreca","yigit","florina-muntenescu","ChrisCraik",
            "tikurahul", "chethaase","keyboardsurfer", "jonathan-caryl", "jabubake","zakharovsergey1000","danysantiago",
            "dazza5000","svasilinets","codingjeremy","DAGalpin","LeoAndo","dennis-sheil", "dgngulcan","jbw0033","kokoro-team",
            "claraf3","hegazy","MrRexZ","Apisov","tensory","pianoben","camsteffen","cbeyls")
        val listView = findViewById<ListView>(R.id.listView)


        // adapterを作成
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, data)

        // adapterをlistViewに紐付けます。モニターに表示(listViewはid名)
        listView.adapter = adapter


        // listViewの行がクリックされた時のイベントリスナー
        listView.setOnItemClickListener { adapterView, _, position, _ ->
            val item = adapterView.getItemAtPosition(position) as String
            val intent = Intent(this, activity_second::class.java)
            //引数設定
            if(item == data[0]) {
                intent.putExtra("KEY", """
    "login": "ianhanniballake",
    "id": 517315,
    "node_id": "MDQ6VXNlcjUxNzMxNQ==",
    "avatar_url": "https://avatars1.githubusercontent.com/u/517315?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/ianhanniballake",
    "html_url": "https://github.com/ianhanniballake",
    "followers_url": "https://api.github.com/users/ianhanniballake/followers",
    "following_url": "https://api.github.com/users/ianhanniballake/following{/other_user}",
    "gists_url": "https://api.github.com/users/ianhanniballake/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/ianhanniballake/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/ianhanniballake/subscriptions",
    "organizations_url": "https://api.github.com/users/ianhanniballake/orgs",
    "repos_url": "https://api.github.com/users/ianhanniballake/repos",
    "events_url": "https://api.github.com/users/ianhanniballake/events{/privacy}",
    "received_events_url": "https://api.github.com/users/ianhanniballake/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 118
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[1]){
                intent.putExtra("KEY", """
     "login": "dlam",
    "id": 831038,
    "node_id": "MDQ6VXNlcjgzMTAzOA==",
    "avatar_url": "https://avatars3.githubusercontent.com/u/831038?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/dlam",
    "html_url": "https://github.com/dlam",
    "followers_url": "https://api.github.com/users/dlam/followers",
    "following_url": "https://api.github.com/users/dlam/following{/other_user}",
    "gists_url": "https://api.github.com/users/dlam/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/dlam/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/dlam/subscriptions",
    "organizations_url": "https://api.github.com/users/dlam/orgs",
    "repos_url": "https://api.github.com/users/dlam/repos",
    "events_url": "https://api.github.com/users/dlam/events{/privacy}",
    "received_events_url": "https://api.github.com/users/dlam/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 74
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[2]){
                intent.putExtra("KEY", """
    "login": "JoseAlcerreca",
    "id": 609125,
    "node_id": "MDQ6VXNlcjYwOTEyNQ==",
    "avatar_url": "https://avatars0.githubusercontent.com/u/609125?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/JoseAlcerreca",
    "html_url": "https://github.com/JoseAlcerreca",
    "followers_url": "https://api.github.com/users/JoseAlcerreca/followers",
    "following_url": "https://api.github.com/users/JoseAlcerreca/following{/other_user}",
    "gists_url": "https://api.github.com/users/JoseAlcerreca/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/JoseAlcerreca/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/JoseAlcerreca/subscriptions",
    "organizations_url": "https://api.github.com/users/JoseAlcerreca/orgs",
    "repos_url": "https://api.github.com/users/JoseAlcerreca/repos",
    "events_url": "https://api.github.com/users/JoseAlcerreca/events{/privacy}",
    "received_events_url": "https://api.github.com/users/JoseAlcerreca/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 60
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item　さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[3]){
                intent.putExtra("KEY", """
    "login": "yigit",
    "id": 89202,
    "node_id": "MDQ6VXNlcjg5MjAy",
    "avatar_url": "https://avatars0.githubusercontent.com/u/89202?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/yigit",
    "html_url": "https://github.com/yigit",
    "followers_url": "https://api.github.com/users/yigit/followers",
    "following_url": "https://api.github.com/users/yigit/following{/other_user}",
    "gists_url": "https://api.github.com/users/yigit/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/yigit/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/yigit/subscriptions",
    "organizations_url": "https://api.github.com/users/yigit/orgs",
    "repos_url": "https://api.github.com/users/yigit/repos",
    "events_url": "https://api.github.com/users/yigit/events{/privacy}",
    "received_events_url": "https://api.github.com/users/yigit/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 47
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[4]){
                intent.putExtra("KEY", """
    "login": "florina-muntenescu",
    "id": 2998890,
    "node_id": "MDQ6VXNlcjI5OTg4OTA=",
    "avatar_url": "https://avatars1.githubusercontent.com/u/2998890?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/florina-muntenescu",
    "html_url": "https://github.com/florina-muntenescu",
    "followers_url": "https://api.github.com/users/florina-muntenescu/followers",
    "following_url": "https://api.github.com/users/florina-muntenescu/following{/other_user}",
    "gists_url": "https://api.github.com/users/florina-muntenescu/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/florina-muntenescu/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/florina-muntenescu/subscriptions",
    "organizations_url": "https://api.github.com/users/florina-muntenescu/orgs",
    "repos_url": "https://api.github.com/users/florina-muntenescu/repos",
    "events_url": "https://api.github.com/users/florina-muntenescu/events{/privacy}",
    "received_events_url": "https://api.github.com/users/florina-muntenescu/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 41
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[5]){
                intent.putExtra("KEY", """
    "login": "ChrisCraik",
    "id": 384439,
    "node_id": "MDQ6VXNlcjM4NDQzOQ==",
    "avatar_url": "https://avatars2.githubusercontent.com/u/384439?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/ChrisCraik",
    "html_url": "https://github.com/ChrisCraik",
    "followers_url": "https://api.github.com/users/ChrisCraik/followers",
    "following_url": "https://api.github.com/users/ChrisCraik/following{/other_user}",
    "gists_url": "https://api.github.com/users/ChrisCraik/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/ChrisCraik/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/ChrisCraik/subscriptions",
    "organizations_url": "https://api.github.com/users/ChrisCraik/orgs",
    "repos_url": "https://api.github.com/users/ChrisCraik/repos",
    "events_url": "https://api.github.com/users/ChrisCraik/events{/privacy}",
    "received_events_url": "https://api.github.com/users/ChrisCraik/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 34
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[6]){
                intent.putExtra("KEY", """
    "login": "tikurahul",
    "id": 624211,
    "node_id": "MDQ6VXNlcjYyNDIxMQ==",
    "avatar_url": "https://avatars0.githubusercontent.com/u/624211?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/tikurahul",
    "html_url": "https://github.com/tikurahul",
    "followers_url": "https://api.github.com/users/tikurahul/followers",
    "following_url": "https://api.github.com/users/tikurahul/following{/other_user}",
    "gists_url": "https://api.github.com/users/tikurahul/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/tikurahul/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/tikurahul/subscriptions",
    "organizations_url": "https://api.github.com/users/tikurahul/orgs",
    "repos_url": "https://api.github.com/users/tikurahul/repos",
    "events_url": "https://api.github.com/users/tikurahul/events{/privacy}",
    "received_events_url": "https://api.github.com/users/tikurahul/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 22
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[7]){
                intent.putExtra("KEY", """
    "login": "chethaase",
    "id": 17732792,
    "node_id": "MDQ6VXNlcjE3NzMyNzky",
    "avatar_url": "https://avatars3.githubusercontent.com/u/17732792?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/chethaase",
    "html_url": "https://github.com/chethaase",
    "followers_url": "https://api.github.com/users/chethaase/followers",
    "following_url": "https://api.github.com/users/chethaase/following{/other_user}",
    "gists_url": "https://api.github.com/users/chethaase/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/chethaase/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/chethaase/subscriptions",
    "organizations_url": "https://api.github.com/users/chethaase/orgs",
    "repos_url": "https://api.github.com/users/chethaase/repos",
    "events_url": "https://api.github.com/users/chethaase/events{/privacy}",
    "received_events_url": "https://api.github.com/users/chethaase/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 9
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[8]){
                intent.putExtra("KEY", """
    "login": "keyboardsurfer",
    "id": 336005,
    "node_id": "MDQ6VXNlcjMzNjAwNQ==",
    "avatar_url": "https://avatars2.githubusercontent.com/u/336005?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/keyboardsurfer",
    "html_url": "https://github.com/keyboardsurfer",
    "followers_url": "https://api.github.com/users/keyboardsurfer/followers",
    "following_url": "https://api.github.com/users/keyboardsurfer/following{/other_user}",
    "gists_url": "https://api.github.com/users/keyboardsurfer/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/keyboardsurfer/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/keyboardsurfer/subscriptions",
    "organizations_url": "https://api.github.com/users/keyboardsurfer/orgs",
    "repos_url": "https://api.github.com/users/keyboardsurfer/repos",
    "events_url": "https://api.github.com/users/keyboardsurfer/events{/privacy}",
    "received_events_url": "https://api.github.com/users/keyboardsurfer/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 8
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[9]){
                intent.putExtra("KEY", """
    "login": "jonathan-caryl",
    "id": 2290987,
    "node_id": "MDQ6VXNlcjIyOTA5ODc=",
    "avatar_url": "https://avatars2.githubusercontent.com/u/2290987?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/jonathan-caryl",
    "html_url": "https://github.com/jonathan-caryl",
    "followers_url": "https://api.github.com/users/jonathan-caryl/followers",
    "following_url": "https://api.github.com/users/jonathan-caryl/following{/other_user}",
    "gists_url": "https://api.github.com/users/jonathan-caryl/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/jonathan-caryl/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/jonathan-caryl/subscriptions",
    "organizations_url": "https://api.github.com/users/jonathan-caryl/orgs",
    "repos_url": "https://api.github.com/users/jonathan-caryl/repos",
    "events_url": "https://api.github.com/users/jonathan-caryl/events{/privacy}",
    "received_events_url": "https://api.github.com/users/jonathan-caryl/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 6
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[10]){
                intent.putExtra("KEY", """
    "login": "jabubake",
    "id": 23587163,
    "node_id": "MDQ6VXNlcjIzNTg3MTYz",
    "avatar_url": "https://avatars2.githubusercontent.com/u/23587163?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/jabubake",
    "html_url": "https://github.com/jabubake",
    "followers_url": "https://api.github.com/users/jabubake/followers",
    "following_url": "https://api.github.com/users/jabubake/following{/other_user}",
    "gists_url": "https://api.github.com/users/jabubake/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/jabubake/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/jabubake/subscriptions",
    "organizations_url": "https://api.github.com/users/jabubake/orgs",
    "repos_url": "https://api.github.com/users/jabubake/repos",
    "events_url": "https://api.github.com/users/jabubake/events{/privacy}",
    "received_events_url": "https://api.github.com/users/jabubake/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 5
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[11]){
                intent.putExtra("KEY", """
    "login": "zakharovsergey1000",
    "id": 32726276,
    "node_id": "MDQ6VXNlcjMyNzI2Mjc2",
    "avatar_url": "https://avatars0.githubusercontent.com/u/32726276?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/zakharovsergey1000",
    "html_url": "https://github.com/zakharovsergey1000",
    "followers_url": "https://api.github.com/users/zakharovsergey1000/followers",
    "following_url": "https://api.github.com/users/zakharovsergey1000/following{/other_user}",
    "gists_url": "https://api.github.com/users/zakharovsergey1000/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/zakharovsergey1000/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/zakharovsergey1000/subscriptions",
    "organizations_url": "https://api.github.com/users/zakharovsergey1000/orgs",
    "repos_url": "https://api.github.com/users/zakharovsergey1000/repos",
    "events_url": "https://api.github.com/users/zakharovsergey1000/events{/privacy}",
    "received_events_url": "https://api.github.com/users/zakharovsergey1000/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 5
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[12]){
                intent.putExtra("KEY", """
    "login": "danysantiago",
    "id": 1844995,
    "node_id": "MDQ6VXNlcjE4NDQ5OTU=",
    "avatar_url": "https://avatars2.githubusercontent.com/u/1844995?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/danysantiago",
    "html_url": "https://github.com/danysantiago",
    "followers_url": "https://api.github.com/users/danysantiago/followers",
    "following_url": "https://api.github.com/users/danysantiago/following{/other_user}",
    "gists_url": "https://api.github.com/users/danysantiago/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/danysantiago/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/danysantiago/subscriptions",
    "organizations_url": "https://api.github.com/users/danysantiago/orgs",
    "repos_url": "https://api.github.com/users/danysantiago/repos",
    "events_url": "https://api.github.com/users/danysantiago/events{/privacy}",
    "received_events_url": "https://api.github.com/users/danysantiago/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 4
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[13]){
                intent.putExtra("KEY", """
    "login": "dazza5000",
    "id": 1117489,
    "node_id": "MDQ6VXNlcjExMTc0ODk=",
    "avatar_url": "https://avatars0.githubusercontent.com/u/1117489?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/dazza5000",
    "html_url": "https://github.com/dazza5000",
    "followers_url": "https://api.github.com/users/dazza5000/followers",
    "following_url": "https://api.github.com/users/dazza5000/following{/other_user}",
    "gists_url": "https://api.github.com/users/dazza5000/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/dazza5000/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/dazza5000/subscriptions",
    "organizations_url": "https://api.github.com/users/dazza5000/orgs",
    "repos_url": "https://api.github.com/users/dazza5000/repos",
    "events_url": "https://api.github.com/users/dazza5000/events{/privacy}",
    "received_events_url": "https://api.github.com/users/dazza5000/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 4
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[14]){
                intent.putExtra("KEY", """
    "login": "svasilinets",
    "id": 618966,
    "node_id": "MDQ6VXNlcjYxODk2Ng==",
    "avatar_url": "https://avatars0.githubusercontent.com/u/618966?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/svasilinets",
    "html_url": "https://github.com/svasilinets",
    "followers_url": "https://api.github.com/users/svasilinets/followers",
    "following_url": "https://api.github.com/users/svasilinets/following{/other_user}",
    "gists_url": "https://api.github.com/users/svasilinets/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/svasilinets/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/svasilinets/subscriptions",
    "organizations_url": "https://api.github.com/users/svasilinets/orgs",
    "repos_url": "https://api.github.com/users/svasilinets/repos",
    "events_url": "https://api.github.com/users/svasilinets/events{/privacy}",
    "received_events_url": "https://api.github.com/users/svasilinets/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 4
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[15]){
                intent.putExtra("KEY", """
    "login": "codingjeremy",
    "id": 4154598,
    "node_id": "MDQ6VXNlcjQxNTQ1OTg=",
    "avatar_url": "https://avatars0.githubusercontent.com/u/4154598?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/codingjeremy",
    "html_url": "https://github.com/codingjeremy",
    "followers_url": "https://api.github.com/users/codingjeremy/followers",
    "following_url": "https://api.github.com/users/codingjeremy/following{/other_user}",
    "gists_url": "https://api.github.com/users/codingjeremy/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/codingjeremy/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/codingjeremy/subscriptions",
    "organizations_url": "https://api.github.com/users/codingjeremy/orgs",
    "repos_url": "https://api.github.com/users/codingjeremy/repos",
    "events_url": "https://api.github.com/users/codingjeremy/events{/privacy}",
    "received_events_url": "https://api.github.com/users/codingjeremy/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 3
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[16]){
                intent.putExtra("KEY", """
    "login": "DAGalpin",
    "id": 7738968,
    "node_id": "MDQ6VXNlcjc3Mzg5Njg=",
    "avatar_url": "https://avatars2.githubusercontent.com/u/7738968?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/DAGalpin",
    "html_url": "https://github.com/DAGalpin",
    "followers_url": "https://api.github.com/users/DAGalpin/followers",
    "following_url": "https://api.github.com/users/DAGalpin/following{/other_user}",
    "gists_url": "https://api.github.com/users/DAGalpin/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/DAGalpin/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/DAGalpin/subscriptions",
    "organizations_url": "https://api.github.com/users/DAGalpin/orgs",
    "repos_url": "https://api.github.com/users/DAGalpin/repos",
    "events_url": "https://api.github.com/users/DAGalpin/events{/privacy}",
    "received_events_url": "https://api.github.com/users/DAGalpin/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 3
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[17]){
                intent.putExtra("KEY", """
    "login": "LeoAndo",
    "id": 16476224,
    "node_id": "MDQ6VXNlcjE2NDc2MjI0",
    "avatar_url": "https://avatars2.githubusercontent.com/u/16476224?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/LeoAndo",
    "html_url": "https://github.com/LeoAndo",
    "followers_url": "https://api.github.com/users/LeoAndo/followers",
    "following_url": "https://api.github.com/users/LeoAndo/following{/other_user}",
    "gists_url": "https://api.github.com/users/LeoAndo/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/LeoAndo/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/LeoAndo/subscriptions",
    "organizations_url": "https://api.github.com/users/LeoAndo/orgs",
    "repos_url": "https://api.github.com/users/LeoAndo/repos",
    "events_url": "https://api.github.com/users/LeoAndo/events{/privacy}",
    "received_events_url": "https://api.github.com/users/LeoAndo/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 3
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[18]) {
                intent.putExtra("KEY", """
    "login": "dennis-sheil",
    "id": 1161550,
    "node_id": "MDQ6VXNlcjExNjE1NTA=",
    "avatar_url": "https://avatars1.githubusercontent.com/u/1161550?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/dennis-sheil",
    "html_url": "https://github.com/dennis-sheil",
    "followers_url": "https://api.github.com/users/dennis-sheil/followers",
    "following_url": "https://api.github.com/users/dennis-sheil/following{/other_user}",
    "gists_url": "https://api.github.com/users/dennis-sheil/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/dennis-sheil/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/dennis-sheil/subscriptions",
    "organizations_url": "https://api.github.com/users/dennis-sheil/orgs",
    "repos_url": "https://api.github.com/users/dennis-sheil/repos",
    "events_url": "https://api.github.com/users/dennis-sheil/events{/privacy}",
    "received_events_url": "https://api.github.com/users/dennis-sheil/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 2
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[19]) {
                intent.putExtra("KEY", """
    "login": "dgngulcan",
    "id": 1465496,
    "node_id": "MDQ6VXNlcjE0NjU0OTY=",
    "avatar_url": "https://avatars0.githubusercontent.com/u/1465496?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/dgngulcan",
    "html_url": "https://github.com/dgngulcan",
    "followers_url": "https://api.github.com/users/dgngulcan/followers",
    "following_url": "https://api.github.com/users/dgngulcan/following{/other_user}",
    "gists_url": "https://api.github.com/users/dgngulcan/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/dgngulcan/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/dgngulcan/subscriptions",
    "organizations_url": "https://api.github.com/users/dgngulcan/orgs",
    "repos_url": "https://api.github.com/users/dgngulcan/repos",
    "events_url": "https://api.github.com/users/dgngulcan/events{/privacy}",
    "received_events_url": "https://api.github.com/users/dgngulcan/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 2
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[20]) {
                intent.putExtra("KEY", """
    "login": "jbw0033",
    "id": 17055233,
    "node_id": "MDQ6VXNlcjE3MDU1MjMz",
    "avatar_url": "https://avatars0.githubusercontent.com/u/17055233?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/jbw0033",
    "html_url": "https://github.com/jbw0033",
    "followers_url": "https://api.github.com/users/jbw0033/followers",
    "following_url": "https://api.github.com/users/jbw0033/following{/other_user}",
    "gists_url": "https://api.github.com/users/jbw0033/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/jbw0033/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/jbw0033/subscriptions",
    "organizations_url": "https://api.github.com/users/jbw0033/orgs",
    "repos_url": "https://api.github.com/users/jbw0033/repos",
    "events_url": "https://api.github.com/users/jbw0033/events{/privacy}",
    "received_events_url": "https://api.github.com/users/jbw0033/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 2
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[21]) {
                intent.putExtra("KEY", """
    "login": "kokoro-team",
    "id": 24443108,
    "node_id": "MDQ6VXNlcjI0NDQzMTA4",
    "avatar_url": "https://avatars1.githubusercontent.com/u/24443108?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/kokoro-team",
    "html_url": "https://github.com/kokoro-team",
    "followers_url": "https://api.github.com/users/kokoro-team/followers",
    "following_url": "https://api.github.com/users/kokoro-team/following{/other_user}",
    "gists_url": "https://api.github.com/users/kokoro-team/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/kokoro-team/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/kokoro-team/subscriptions",
    "organizations_url": "https://api.github.com/users/kokoro-team/orgs",
    "repos_url": "https://api.github.com/users/kokoro-team/repos",
    "events_url": "https://api.github.com/users/kokoro-team/events{/privacy}",
    "received_events_url": "https://api.github.com/users/kokoro-team/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 2
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[22]) {
                intent.putExtra("KEY", """
    "login": "claraf3",
    "id": 63677432,
    "node_id": "MDQ6VXNlcjYzNjc3NDMy",
    "avatar_url": "https://avatars3.githubusercontent.com/u/63677432?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/claraf3",
    "html_url": "https://github.com/claraf3",
    "followers_url": "https://api.github.com/users/claraf3/followers",
    "following_url": "https://api.github.com/users/claraf3/following{/other_user}",
    "gists_url": "https://api.github.com/users/claraf3/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/claraf3/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/claraf3/subscriptions",
    "organizations_url": "https://api.github.com/users/claraf3/orgs",
    "repos_url": "https://api.github.com/users/claraf3/repos",
    "events_url": "https://api.github.com/users/claraf3/events{/privacy}",
    "received_events_url": "https://api.github.com/users/claraf3/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 2
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[23]) {
                intent.putExtra("KEY", """
    "login": "hegazy",
    "id": 2749269,
    "node_id": "MDQ6VXNlcjI3NDkyNjk=",
    "avatar_url": "https://avatars1.githubusercontent.com/u/2749269?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/hegazy",
    "html_url": "https://github.com/hegazy",
    "followers_url": "https://api.github.com/users/hegazy/followers",
    "following_url": "https://api.github.com/users/hegazy/following{/other_user}",
    "gists_url": "https://api.github.com/users/hegazy/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/hegazy/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/hegazy/subscriptions",
    "organizations_url": "https://api.github.com/users/hegazy/orgs",
    "repos_url": "https://api.github.com/users/hegazy/repos",
    "events_url": "https://api.github.com/users/hegazy/events{/privacy}",
    "received_events_url": "https://api.github.com/users/hegazy/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 1
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[24]) {
                intent.putExtra("KEY", """
    "login": "MrRexZ",
    "id": 9110907,
    "node_id": "MDQ6VXNlcjkxMTA5MDc=",
    "avatar_url": "https://avatars0.githubusercontent.com/u/9110907?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/MrRexZ",
    "html_url": "https://github.com/MrRexZ",
    "followers_url": "https://api.github.com/users/MrRexZ/followers",
    "following_url": "https://api.github.com/users/MrRexZ/following{/other_user}",
    "gists_url": "https://api.github.com/users/MrRexZ/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/MrRexZ/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/MrRexZ/subscriptions",
    "organizations_url": "https://api.github.com/users/MrRexZ/orgs",
    "repos_url": "https://api.github.com/users/MrRexZ/repos",
    "events_url": "https://api.github.com/users/MrRexZ/events{/privacy}",
    "received_events_url": "https://api.github.com/users/MrRexZ/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 1
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[25]) {
                intent.putExtra("KEY", """
    "login": "Apisov",
    "id": 7279438,
    "node_id": "MDQ6VXNlcjcyNzk0Mzg=",
    "avatar_url": "https://avatars3.githubusercontent.com/u/7279438?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/Apisov",
    "html_url": "https://github.com/Apisov",
    "followers_url": "https://api.github.com/users/Apisov/followers",
    "following_url": "https://api.github.com/users/Apisov/following{/other_user}",
    "gists_url": "https://api.github.com/users/Apisov/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/Apisov/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/Apisov/subscriptions",
    "organizations_url": "https://api.github.com/users/Apisov/orgs",
    "repos_url": "https://api.github.com/users/Apisov/repos",
    "events_url": "https://api.github.com/users/Apisov/events{/privacy}",
    "received_events_url": "https://api.github.com/users/Apisov/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 1
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[26]) {
                intent.putExtra("KEY", """
    "login": "tensory",
    "id": 697417,
    "node_id": "MDQ6VXNlcjY5NzQxNw==",
    "avatar_url": "https://avatars0.githubusercontent.com/u/697417?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/tensory",
    "html_url": "https://github.com/tensory",
    "followers_url": "https://api.github.com/users/tensory/followers",
    "following_url": "https://api.github.com/users/tensory/following{/other_user}",
    "gists_url": "https://api.github.com/users/tensory/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/tensory/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/tensory/subscriptions",
    "organizations_url": "https://api.github.com/users/tensory/orgs",
    "repos_url": "https://api.github.com/users/tensory/repos",
    "events_url": "https://api.github.com/users/tensory/events{/privacy}",
    "received_events_url": "https://api.github.com/users/tensory/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 1
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[27]) {
                intent.putExtra("KEY", """
    "login": "pianoben",
    "id": 419741,
    "node_id": "MDQ6VXNlcjQxOTc0MQ==",
    "avatar_url": "https://avatars1.githubusercontent.com/u/419741?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/pianoben",
    "html_url": "https://github.com/pianoben",
    "followers_url": "https://api.github.com/users/pianoben/followers",
    "following_url": "https://api.github.com/users/pianoben/following{/other_user}",
    "gists_url": "https://api.github.com/users/pianoben/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/pianoben/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/pianoben/subscriptions",
    "organizations_url": "https://api.github.com/users/pianoben/orgs",
    "repos_url": "https://api.github.com/users/pianoben/repos",
    "events_url": "https://api.github.com/users/pianoben/events{/privacy}",
    "received_events_url": "https://api.github.com/users/pianoben/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 1
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[28]) {
                intent.putExtra("KEY", """
    "login": "camsteffen",
    "id": 5565418,
    "node_id": "MDQ6VXNlcjU1NjU0MTg=",
    "avatar_url": "https://avatars0.githubusercontent.com/u/5565418?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/camsteffen",
    "html_url": "https://github.com/camsteffen",
    "followers_url": "https://api.github.com/users/camsteffen/followers",
    "following_url": "https://api.github.com/users/camsteffen/following{/other_user}",
    "gists_url": "https://api.github.com/users/camsteffen/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/camsteffen/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/camsteffen/subscriptions",
    "organizations_url": "https://api.github.com/users/camsteffen/orgs",
    "repos_url": "https://api.github.com/users/camsteffen/repos",
    "events_url": "https://api.github.com/users/camsteffen/events{/privacy}",
    "received_events_url": "https://api.github.com/users/camsteffen/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 1
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
            else if(item == data[29]) {
                intent.putExtra("KEY", """
    "login": "cbeyls",
    "id": 5943234,
    "node_id": "MDQ6VXNlcjU5NDMyMzQ=",
    "avatar_url": "https://avatars3.githubusercontent.com/u/5943234?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/cbeyls",
    "html_url": "https://github.com/cbeyls",
    "followers_url": "https://api.github.com/users/cbeyls/followers",
    "following_url": "https://api.github.com/users/cbeyls/following{/other_user}",
    "gists_url": "https://api.github.com/users/cbeyls/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/cbeyls/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/cbeyls/subscriptions",
    "organizations_url": "https://api.github.com/users/cbeyls/orgs",
    "repos_url": "https://api.github.com/users/cbeyls/repos",
    "events_url": "https://api.github.com/users/cbeyls/events{/privacy}",
    "received_events_url": "https://api.github.com/users/cbeyls/received_events",
    "type": "User",
    "site_admin": false,
    "contributions": 1
                """.trimIndent())
                startActivity(intent)
                Toast.makeText(this, "$item さんの詳細です", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
