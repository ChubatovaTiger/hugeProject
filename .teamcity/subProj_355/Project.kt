package subProj_355

import subProj_355.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_355")
    name = "subProj 355"

    buildType(subProj_bt_355_5)
    buildType(subProj_bt_355_1)
    buildType(subProj_bt_355_2)
    buildType(subProj_bt_355_3)
    buildType(subProj_bt_355_4)
    buildType(subProj_bt_355_0)
})
