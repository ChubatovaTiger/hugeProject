package subProj_423

import subProj_423.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_423")
    name = "subProj 423"

    buildType(subProj_bt_423_0)
    buildType(subProj_bt_423_2)
    buildType(subProj_bt_423_1)
    buildType(subProj_bt_423_4)
    buildType(subProj_bt_423_3)
    buildType(subProj_bt_423_5)
})
