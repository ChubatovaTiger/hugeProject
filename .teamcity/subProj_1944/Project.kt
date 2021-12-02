package subProj_1944

import subProj_1944.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1944")
    name = "subProj 1944"

    buildType(subProj_bt_1944_1)
    buildType(subProj_bt_1944_0)
    buildType(subProj_bt_1944_5)
    buildType(subProj_bt_1944_4)
    buildType(subProj_bt_1944_3)
    buildType(subProj_bt_1944_2)
})
