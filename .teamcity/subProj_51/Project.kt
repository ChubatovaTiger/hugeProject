package subProj_51

import subProj_51.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_51")
    name = "subProj 51"

    buildType(subProj_bt_51_1)
    buildType(subProj_bt_51_0)
    buildType(subProj_bt_51_3)
    buildType(subProj_bt_51_2)
    buildType(subProj_bt_51_5)
    buildType(subProj_bt_51_4)
})
