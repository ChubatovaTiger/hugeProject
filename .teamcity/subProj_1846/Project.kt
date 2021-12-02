package subProj_1846

import subProj_1846.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1846")
    name = "subProj 1846"

    buildType(subProj_bt_1846_0)
    buildType(subProj_bt_1846_5)
    buildType(subProj_bt_1846_2)
    buildType(subProj_bt_1846_1)
    buildType(subProj_bt_1846_4)
    buildType(subProj_bt_1846_3)
})
