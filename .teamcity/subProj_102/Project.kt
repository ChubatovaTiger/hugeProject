package subProj_102

import subProj_102.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_102")
    name = "subProj 102"

    buildType(subProj_bt_102_5)
    buildType(subProj_bt_102_3)
    buildType(subProj_bt_102_4)
    buildType(subProj_bt_102_1)
    buildType(subProj_bt_102_2)
    buildType(subProj_bt_102_0)
})
