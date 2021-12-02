package subProj_443

import subProj_443.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_443")
    name = "subProj 443"

    buildType(subProj_bt_443_3)
    buildType(subProj_bt_443_4)
    buildType(subProj_bt_443_1)
    buildType(subProj_bt_443_2)
    buildType(subProj_bt_443_5)
    buildType(subProj_bt_443_0)
})
