package subProj_622

import subProj_622.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_622")
    name = "subProj 622"

    buildType(subProj_bt_622_3)
    buildType(subProj_bt_622_2)
    buildType(subProj_bt_622_5)
    buildType(subProj_bt_622_4)
    buildType(subProj_bt_622_1)
    buildType(subProj_bt_622_0)
})
