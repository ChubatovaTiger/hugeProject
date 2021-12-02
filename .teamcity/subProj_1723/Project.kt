package subProj_1723

import subProj_1723.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1723")
    name = "subProj 1723"

    buildType(subProj_bt_1723_1)
    buildType(subProj_bt_1723_2)
    buildType(subProj_bt_1723_0)
    buildType(subProj_bt_1723_5)
    buildType(subProj_bt_1723_3)
    buildType(subProj_bt_1723_4)
})
