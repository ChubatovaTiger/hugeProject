package subProj_847

import subProj_847.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_847")
    name = "subProj 847"

    buildType(subProj_bt_847_3)
    buildType(subProj_bt_847_4)
    buildType(subProj_bt_847_1)
    buildType(subProj_bt_847_2)
    buildType(subProj_bt_847_5)
    buildType(subProj_bt_847_0)
})
