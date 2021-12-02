package subProj_1211

import subProj_1211.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1211")
    name = "subProj 1211"

    buildType(subProj_bt_1211_0)
    buildType(subProj_bt_1211_5)
    buildType(subProj_bt_1211_4)
    buildType(subProj_bt_1211_3)
    buildType(subProj_bt_1211_2)
    buildType(subProj_bt_1211_1)
})
