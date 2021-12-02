package subProj_633

import subProj_633.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_633")
    name = "subProj 633"

    buildType(subProj_bt_633_3)
    buildType(subProj_bt_633_2)
    buildType(subProj_bt_633_5)
    buildType(subProj_bt_633_4)
    buildType(subProj_bt_633_1)
    buildType(subProj_bt_633_0)
})
