package subProj_1201

import subProj_1201.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1201")
    name = "subProj 1201"

    buildType(subProj_bt_1201_5)
    buildType(subProj_bt_1201_4)
    buildType(subProj_bt_1201_3)
    buildType(subProj_bt_1201_2)
    buildType(subProj_bt_1201_1)
    buildType(subProj_bt_1201_0)
})
