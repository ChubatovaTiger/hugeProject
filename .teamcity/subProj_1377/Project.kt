package subProj_1377

import subProj_1377.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1377")
    name = "subProj 1377"

    buildType(subProj_bt_1377_0)
    buildType(subProj_bt_1377_1)
    buildType(subProj_bt_1377_2)
    buildType(subProj_bt_1377_3)
    buildType(subProj_bt_1377_4)
    buildType(subProj_bt_1377_5)
})
