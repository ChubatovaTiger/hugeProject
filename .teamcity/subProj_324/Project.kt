package subProj_324

import subProj_324.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_324")
    name = "subProj 324"

    buildType(subProj_bt_324_2)
    buildType(subProj_bt_324_1)
    buildType(subProj_bt_324_0)
    buildType(subProj_bt_324_5)
    buildType(subProj_bt_324_4)
    buildType(subProj_bt_324_3)
})
