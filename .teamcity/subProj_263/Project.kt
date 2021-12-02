package subProj_263

import subProj_263.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_263")
    name = "subProj 263"

    buildType(subProj_bt_263_5)
    buildType(subProj_bt_263_3)
    buildType(subProj_bt_263_4)
    buildType(subProj_bt_263_1)
    buildType(subProj_bt_263_2)
    buildType(subProj_bt_263_0)
})
