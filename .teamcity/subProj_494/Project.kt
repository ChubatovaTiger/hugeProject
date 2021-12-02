package subProj_494

import subProj_494.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_494")
    name = "subProj 494"

    buildType(subProj_bt_494_5)
    buildType(subProj_bt_494_1)
    buildType(subProj_bt_494_2)
    buildType(subProj_bt_494_3)
    buildType(subProj_bt_494_4)
    buildType(subProj_bt_494_0)
})
