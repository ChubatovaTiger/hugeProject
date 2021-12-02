package subProj_1792

import subProj_1792.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1792")
    name = "subProj 1792"

    buildType(subProj_bt_1792_0)
    buildType(subProj_bt_1792_2)
    buildType(subProj_bt_1792_1)
    buildType(subProj_bt_1792_4)
    buildType(subProj_bt_1792_3)
    buildType(subProj_bt_1792_5)
})
