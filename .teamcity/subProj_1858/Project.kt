package subProj_1858

import subProj_1858.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1858")
    name = "subProj 1858"

    buildType(subProj_bt_1858_4)
    buildType(subProj_bt_1858_5)
    buildType(subProj_bt_1858_2)
    buildType(subProj_bt_1858_3)
    buildType(subProj_bt_1858_0)
    buildType(subProj_bt_1858_1)
})
