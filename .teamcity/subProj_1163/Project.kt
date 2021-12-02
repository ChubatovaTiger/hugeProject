package subProj_1163

import subProj_1163.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1163")
    name = "subProj 1163"

    buildType(subProj_bt_1163_5)
    buildType(subProj_bt_1163_0)
    buildType(subProj_bt_1163_4)
    buildType(subProj_bt_1163_3)
    buildType(subProj_bt_1163_2)
    buildType(subProj_bt_1163_1)
})
