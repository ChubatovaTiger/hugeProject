package subProj_1237

import subProj_1237.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1237")
    name = "subProj 1237"

    buildType(subProj_bt_1237_0)
    buildType(subProj_bt_1237_1)
    buildType(subProj_bt_1237_2)
    buildType(subProj_bt_1237_3)
    buildType(subProj_bt_1237_4)
    buildType(subProj_bt_1237_5)
})
