package subProj_1115

import subProj_1115.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1115")
    name = "subProj 1115"

    buildType(subProj_bt_1115_1)
    buildType(subProj_bt_1115_0)
    buildType(subProj_bt_1115_3)
    buildType(subProj_bt_1115_2)
    buildType(subProj_bt_1115_5)
    buildType(subProj_bt_1115_4)
})
