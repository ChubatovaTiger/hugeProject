package subProj_1102

import subProj_1102.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1102")
    name = "subProj 1102"

    buildType(subProj_bt_1102_0)
    buildType(subProj_bt_1102_1)
    buildType(subProj_bt_1102_2)
    buildType(subProj_bt_1102_3)
    buildType(subProj_bt_1102_4)
    buildType(subProj_bt_1102_5)
})
