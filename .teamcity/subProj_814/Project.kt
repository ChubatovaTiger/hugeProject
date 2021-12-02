package subProj_814

import subProj_814.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_814")
    name = "subProj 814"

    buildType(subProj_bt_814_2)
    buildType(subProj_bt_814_1)
    buildType(subProj_bt_814_4)
    buildType(subProj_bt_814_3)
    buildType(subProj_bt_814_5)
    buildType(subProj_bt_814_0)
})
