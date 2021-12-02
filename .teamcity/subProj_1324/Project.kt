package subProj_1324

import subProj_1324.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1324")
    name = "subProj 1324"

    buildType(subProj_bt_1324_4)
    buildType(subProj_bt_1324_5)
    buildType(subProj_bt_1324_2)
    buildType(subProj_bt_1324_3)
    buildType(subProj_bt_1324_0)
    buildType(subProj_bt_1324_1)
})
