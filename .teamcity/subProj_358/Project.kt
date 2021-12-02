package subProj_358

import subProj_358.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_358")
    name = "subProj 358"

    buildType(subProj_bt_358_2)
    buildType(subProj_bt_358_3)
    buildType(subProj_bt_358_4)
    buildType(subProj_bt_358_5)
    buildType(subProj_bt_358_0)
    buildType(subProj_bt_358_1)
})
