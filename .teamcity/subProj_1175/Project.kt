package subProj_1175

import subProj_1175.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1175")
    name = "subProj 1175"

    buildType(subProj_bt_1175_4)
    buildType(subProj_bt_1175_5)
    buildType(subProj_bt_1175_0)
    buildType(subProj_bt_1175_1)
    buildType(subProj_bt_1175_2)
    buildType(subProj_bt_1175_3)
})
