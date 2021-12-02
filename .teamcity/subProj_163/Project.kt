package subProj_163

import subProj_163.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_163")
    name = "subProj 163"

    buildType(subProj_bt_163_0)
    buildType(subProj_bt_163_1)
    buildType(subProj_bt_163_2)
    buildType(subProj_bt_163_3)
    buildType(subProj_bt_163_4)
    buildType(subProj_bt_163_5)
})
