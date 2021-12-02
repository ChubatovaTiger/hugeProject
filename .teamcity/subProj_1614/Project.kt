package subProj_1614

import subProj_1614.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1614")
    name = "subProj 1614"

    buildType(subProj_bt_1614_1)
    buildType(subProj_bt_1614_0)
    buildType(subProj_bt_1614_5)
    buildType(subProj_bt_1614_4)
    buildType(subProj_bt_1614_3)
    buildType(subProj_bt_1614_2)
})
