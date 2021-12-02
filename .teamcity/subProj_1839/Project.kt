package subProj_1839

import subProj_1839.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1839")
    name = "subProj 1839"

    buildType(subProj_bt_1839_5)
    buildType(subProj_bt_1839_2)
    buildType(subProj_bt_1839_1)
    buildType(subProj_bt_1839_4)
    buildType(subProj_bt_1839_3)
    buildType(subProj_bt_1839_0)
})
