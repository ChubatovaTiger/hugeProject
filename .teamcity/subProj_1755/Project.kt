package subProj_1755

import subProj_1755.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1755")
    name = "subProj 1755"

    buildType(subProj_bt_1755_3)
    buildType(subProj_bt_1755_2)
    buildType(subProj_bt_1755_1)
    buildType(subProj_bt_1755_0)
    buildType(subProj_bt_1755_5)
    buildType(subProj_bt_1755_4)
})
