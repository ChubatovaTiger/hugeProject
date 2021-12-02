package subProj_1643

import subProj_1643.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1643")
    name = "subProj 1643"

    buildType(subProj_bt_1643_1)
    buildType(subProj_bt_1643_0)
    buildType(subProj_bt_1643_3)
    buildType(subProj_bt_1643_2)
    buildType(subProj_bt_1643_5)
    buildType(subProj_bt_1643_4)
})
