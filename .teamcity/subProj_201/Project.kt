package subProj_201

import subProj_201.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_201")
    name = "subProj 201"

    buildType(subProj_bt_201_5)
    buildType(subProj_bt_201_1)
    buildType(subProj_bt_201_2)
    buildType(subProj_bt_201_3)
    buildType(subProj_bt_201_4)
    buildType(subProj_bt_201_0)
})
