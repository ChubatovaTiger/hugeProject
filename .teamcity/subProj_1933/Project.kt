package subProj_1933

import subProj_1933.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1933")
    name = "subProj 1933"

    buildType(subProj_bt_1933_1)
    buildType(subProj_bt_1933_0)
    buildType(subProj_bt_1933_5)
    buildType(subProj_bt_1933_4)
    buildType(subProj_bt_1933_3)
    buildType(subProj_bt_1933_2)
})
