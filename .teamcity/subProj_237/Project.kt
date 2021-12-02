package subProj_237

import subProj_237.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_237")
    name = "subProj 237"

    buildType(subProj_bt_237_3)
    buildType(subProj_bt_237_2)
    buildType(subProj_bt_237_5)
    buildType(subProj_bt_237_4)
    buildType(subProj_bt_237_1)
    buildType(subProj_bt_237_0)
})
