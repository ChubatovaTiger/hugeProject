package subProj_805

import subProj_805.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_805")
    name = "subProj 805"

    buildType(subProj_bt_805_0)
    buildType(subProj_bt_805_1)
    buildType(subProj_bt_805_2)
    buildType(subProj_bt_805_3)
    buildType(subProj_bt_805_4)
    buildType(subProj_bt_805_5)
})
