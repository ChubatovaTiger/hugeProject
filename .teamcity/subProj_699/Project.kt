package subProj_699

import subProj_699.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_699")
    name = "subProj 699"

    buildType(subProj_bt_699_0)
    buildType(subProj_bt_699_1)
    buildType(subProj_bt_699_2)
    buildType(subProj_bt_699_3)
    buildType(subProj_bt_699_4)
    buildType(subProj_bt_699_5)
})
