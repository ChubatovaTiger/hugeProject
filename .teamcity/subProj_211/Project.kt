package subProj_211

import subProj_211.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_211")
    name = "subProj 211"

    buildType(subProj_bt_211_2)
    buildType(subProj_bt_211_3)
    buildType(subProj_bt_211_4)
    buildType(subProj_bt_211_5)
    buildType(subProj_bt_211_0)
    buildType(subProj_bt_211_1)
})
