package subProj_45

import subProj_45.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_45")
    name = "subProj 45"

    buildType(subProj_bt_45_0)
    buildType(subProj_bt_45_2)
    buildType(subProj_bt_45_1)
    buildType(subProj_bt_45_4)
    buildType(subProj_bt_45_3)
    buildType(subProj_bt_45_5)
})
