package subProj_984

import subProj_984.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_984")
    name = "subProj 984"

    buildType(subProj_bt_984_1)
    buildType(subProj_bt_984_2)
    buildType(subProj_bt_984_0)
    buildType(subProj_bt_984_5)
    buildType(subProj_bt_984_3)
    buildType(subProj_bt_984_4)
})
