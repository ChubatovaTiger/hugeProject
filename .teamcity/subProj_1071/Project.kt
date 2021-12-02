package subProj_1071

import subProj_1071.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1071")
    name = "subProj 1071"

    buildType(subProj_bt_1071_0)
    buildType(subProj_bt_1071_5)
    buildType(subProj_bt_1071_3)
    buildType(subProj_bt_1071_4)
    buildType(subProj_bt_1071_1)
    buildType(subProj_bt_1071_2)
})
