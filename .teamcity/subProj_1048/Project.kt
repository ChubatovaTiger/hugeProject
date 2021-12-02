package subProj_1048

import subProj_1048.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1048")
    name = "subProj 1048"

    buildType(subProj_bt_1048_3)
    buildType(subProj_bt_1048_4)
    buildType(subProj_bt_1048_5)
    buildType(subProj_bt_1048_0)
    buildType(subProj_bt_1048_1)
    buildType(subProj_bt_1048_2)
})
