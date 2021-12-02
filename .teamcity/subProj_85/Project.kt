package subProj_85

import subProj_85.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_85")
    name = "subProj 85"

    buildType(subProj_bt_85_0)
    buildType(subProj_bt_85_3)
    buildType(subProj_bt_85_4)
    buildType(subProj_bt_85_1)
    buildType(subProj_bt_85_2)
    buildType(subProj_bt_85_5)
})
