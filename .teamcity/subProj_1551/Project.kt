package subProj_1551

import subProj_1551.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1551")
    name = "subProj 1551"

    buildType(subProj_bt_1551_1)
    buildType(subProj_bt_1551_0)
    buildType(subProj_bt_1551_5)
    buildType(subProj_bt_1551_4)
    buildType(subProj_bt_1551_3)
    buildType(subProj_bt_1551_2)
})
