package subProj_1827

import subProj_1827.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1827")
    name = "subProj 1827"

    buildType(subProj_bt_1827_2)
    buildType(subProj_bt_1827_3)
    buildType(subProj_bt_1827_4)
    buildType(subProj_bt_1827_5)
    buildType(subProj_bt_1827_0)
    buildType(subProj_bt_1827_1)
})
