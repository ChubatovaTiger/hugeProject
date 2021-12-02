package subProj_1408

import subProj_1408.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1408")
    name = "subProj 1408"

    buildType(subProj_bt_1408_2)
    buildType(subProj_bt_1408_1)
    buildType(subProj_bt_1408_0)
    buildType(subProj_bt_1408_5)
    buildType(subProj_bt_1408_4)
    buildType(subProj_bt_1408_3)
})
