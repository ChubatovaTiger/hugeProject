package subProj_1355

import subProj_1355.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1355")
    name = "subProj 1355"

    buildType(subProj_bt_1355_5)
    buildType(subProj_bt_1355_4)
    buildType(subProj_bt_1355_3)
    buildType(subProj_bt_1355_2)
    buildType(subProj_bt_1355_1)
    buildType(subProj_bt_1355_0)
})
