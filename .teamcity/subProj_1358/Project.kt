package subProj_1358

import subProj_1358.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1358")
    name = "subProj 1358"

    buildType(subProj_bt_1358_5)
    buildType(subProj_bt_1358_4)
    buildType(subProj_bt_1358_3)
    buildType(subProj_bt_1358_2)
    buildType(subProj_bt_1358_1)
    buildType(subProj_bt_1358_0)
})
