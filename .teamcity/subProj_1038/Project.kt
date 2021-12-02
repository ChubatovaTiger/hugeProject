package subProj_1038

import subProj_1038.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1038")
    name = "subProj 1038"

    buildType(subProj_bt_1038_2)
    buildType(subProj_bt_1038_3)
    buildType(subProj_bt_1038_4)
    buildType(subProj_bt_1038_5)
    buildType(subProj_bt_1038_0)
    buildType(subProj_bt_1038_1)
})
