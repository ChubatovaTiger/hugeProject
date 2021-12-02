package subProj_1524

import subProj_1524.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1524")
    name = "subProj 1524"

    buildType(subProj_bt_1524_4)
    buildType(subProj_bt_1524_5)
    buildType(subProj_bt_1524_2)
    buildType(subProj_bt_1524_3)
    buildType(subProj_bt_1524_0)
    buildType(subProj_bt_1524_1)
})
