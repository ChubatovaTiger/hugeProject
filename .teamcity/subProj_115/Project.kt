package subProj_115

import subProj_115.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_115")
    name = "subProj 115"

    buildType(subProj_bt_115_5)
    buildType(subProj_bt_115_3)
    buildType(subProj_bt_115_4)
    buildType(subProj_bt_115_1)
    buildType(subProj_bt_115_2)
    buildType(subProj_bt_115_0)
})
